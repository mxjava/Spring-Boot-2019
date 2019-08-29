/*
 * 
 */
package mx.com.senorpago.gaspayment.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mx.com.senorpago.gaspayment.apiclient.model.PrecioGasolina;
import mx.com.senorpago.gaspayment.entity.Gasoline;
import mx.com.senorpago.gaspayment.exception.ErrorDetails;
import mx.com.senorpago.gaspayment.model.GasolineRequest;
import mx.com.senorpago.gaspayment.model.GasolineResponse;
import mx.com.senorpago.gaspayment.repository.GasolineRepository;

/**
 * The Class GasolineController.
 */
@Api(value = "gaspayments", description = "the gas payments API")
@RestController
@RequestMapping("/api/v1")
public class GasolineController {

	/** The gasoline repository. */
	@Autowired
	private GasolineRepository gasolineRepository;

	/** The Constant URL_API. */
	static final String URL_API = "https://api.datos.gob.mx/v1/precio.gasolina.publico";

	/**
	 * Creates the gasoline.
	 *
	 * @param key
	 *            the key
	 * @param gasoline
	 *            the gasoline
	 * @return the gasoline
	 */
	@ApiOperation(value = "It allows to make the payment of gasoline.", nickname = "gasolines", notes = " the payment of gasoline'.", response = GasolineResponse.class, tags = {
			"gasolines", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "The payment of gasoline has been executed successfully.", response = GasolineResponse.class),
			@ApiResponse(code = 400, message = "Bad request.", response = ErrorDetails.class),
			@ApiResponse(code = 401, message = "Unauthorized. Request was understood but provided credentials info is invalid.", response = ErrorDetails.class),
			@ApiResponse(code = 403, message = "Forbidden. The credentials info is valid but does not have sufficient rights to perform this operation on the request.", response = ErrorDetails.class),
			@ApiResponse(code = 404, message = "Gasoline payment has not been found.", response = ErrorDetails.class),
			@ApiResponse(code = 422, message = "The value is syntactically correct but semantically incorrect.", response = ErrorDetails.class),
			@ApiResponse(code = 500, message = "Internal server error.", response = ErrorDetails.class) })
	@PostMapping("/gasolines")
	public GasolineResponse createGasoline(@Valid @RequestBody GasolineRequest gasolineRq) {
		// HttpHeaders
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		// Request to return JSON format
		headers.setContentType(MediaType.APPLICATION_JSON);

		String id_ = gasolineRq.getGasType().toString();

		// HttpEntity<String>: To get result as String.
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		// RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// Send request with GET method, and Headers.
		ResponseEntity<PrecioGasolina> responsePrecioGas = restTemplate.exchange(URL_API + "/?_id=" + id_,
				HttpMethod.GET, entity, PrecioGasolina.class);

		System.out.println("id_ = " + responsePrecioGas.getBody().getResults().get(0).get_id());
		System.out.println("Rfc = " + responsePrecioGas.getBody().getResults().get(0).getRfc());

		Gasoline gasoline = new Gasoline();
		gasoline.setAmount(gasolineRq.getAmount());
		gasoline.setCardNumber(gasolineRq.getCardNumber());
		gasoline.setEmail(gasolineRq.getEmail());
		gasoline.setExpirationDateMonth(gasolineRq.getExpirationDateMonth());
		gasoline.setExpirationDateYear(gasolineRq.getExpirationDateYear());
		gasoline.setGasStation(gasolineRq.getGasStation());
		gasoline.setGasType(gasolineRq.getGasType());
		gasoline.setLastName(gasolineRq.getLastName());
		gasoline.setName(gasolineRq.getName());
		gasoline.setSellerName(gasolineRq.getSellerName());
		gasolineRepository.save(gasoline);

		GasolineResponse responseGas = new GasolineResponse();
		responseGas.setSuccess(Boolean.TRUE);
		responseGas.setMessage("“Informacion correcta”");
		responseGas.setError("null");

		return responseGas;
	}

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 */
	// @GetMapping("/gasolines")
	// public List<Gasoline> getAllEmployees() {
	// return gasolineRepository.findAll();
	// }

	/**
	 * Gets the employee by id.
	 *
	 * @param gasolineId
	 *            the gasoline id
	 * @return the employee by id
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	// @GetMapping("/gasolines/{id}")
	// public ResponseEntity<Gasoline> getEmployeeById(@PathVariable(value = "id")
	// Long gasolineId)
	// throws ResourceNotFoundException {
	//
	// Gasoline gasoline = gasolineRepository.findById(gasolineId)
	// .orElseThrow(() -> new ResourceNotFoundException("Gasoline not found for this
	// id :: " + gasolineId));
	// return ResponseEntity.ok().body(gasoline);
	// }

	/**
	 * Update gasoline.
	 *
	 * @param gasolineId
	 *            the gasoline id
	 * @param gasolineDetails
	 *            the gasoline details
	 * @return the response entity
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	// @PutMapping("/gasolines/{id}")
	// public ResponseEntity<Gasoline> updateGasoline(@PathVariable(value = "id")
	// Long gasolineId,
	// @Valid @RequestBody Gasoline gasolineDetails) throws
	// ResourceNotFoundException {
	// Gasoline gasoline = gasolineRepository.findById(gasolineId)
	// .orElseThrow(() -> new ResourceNotFoundException("Gasoline not found for this
	// id :: " + gasolineId));
	//
	// gasoline.setAmount(gasolineDetails.getAmount());
	// gasoline.setCardNumber(gasolineDetails.getCardNumber());
	// gasoline.setEmail(gasolineDetails.getEmail());
	// gasoline.setExpirationDateMonth(gasolineDetails.getExpirationDateMonth());
	// gasoline.setExpirationDateYear(gasolineDetails.getExpirationDateYear());
	// gasoline.setGasStation(gasolineDetails.getGasStation());
	// gasoline.setGasType(gasolineDetails.getGasType());
	// gasoline.setLastName(gasolineDetails.getLastName());
	// gasoline.setName(gasolineDetails.getName());
	// gasoline.setSellerName(gasolineDetails.getSellerName());
	//
	// final Gasoline updatedGasoline = gasolineRepository.save(gasoline);
	// return ResponseEntity.ok(updatedGasoline);
	// }

	/**
	 * Delete employee.
	 *
	 * @param gasolineId
	 *            the gasoline id
	 * @return the map
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	// @DeleteMapping("/gasoline/{id}")
	// public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long
	// gasolineId)
	// throws ResourceNotFoundException {
	// Gasoline gasoline = gasolineRepository.findById(gasolineId)
	// .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this
	// id :: " + gasolineId));
	//
	// gasolineRepository.delete(gasoline);
	// Map<String, Boolean> response = new HashMap<>();
	// response.put("deleted", Boolean.TRUE);
	// return response;
	// }
}
