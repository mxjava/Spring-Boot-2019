/*
 * 
 */
package mx.com.senorpago.gaspayment.apiclient.model;

import java.util.ArrayList;

/**
 * The Class PrecioGasolina.
 */
public class PrecioGasolina {

	/** The Pagination object. */
	Pagination PaginationObject;

	/** The results. */
	ArrayList<Results> results = new ArrayList<Results>();

	/**
	 * Gets the pagination.
	 *
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return PaginationObject;
	}

	/**
	 * Sets the pagination.
	 *
	 * @param paginationObject
	 *            the new pagination
	 */
	public void setPagination(Pagination paginationObject) {
		this.PaginationObject = paginationObject;
	}

	/**
	 * Gets the results.
	 *
	 * @return the results
	 */
	public ArrayList<Results> getResults() {
		return results;
	}

	/**
	 * Sets the results.
	 *
	 * @param results
	 *            the new results
	 */
	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}

}
