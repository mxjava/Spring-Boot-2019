/*
 * 
 */
package mx.com.senorpago.gaspayment.apiclient.model;

/**
 * The Class Pagination.
 */
public class Pagination {

	/** The page size. */
	private float pageSize;

	/** The page. */
	private float page;

	/** The total. */
	private float total;

	/**
	 * Gets the page size.
	 *
	 * @return the page size
	 */
	public float getPageSize() {
		return pageSize;
	}

	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public float getPage() {
		return page;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * Sets the page size.
	 *
	 * @param pageSize
	 *            the new page size
	 */
	public void setPageSize(float pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * Sets the page.
	 *
	 * @param page
	 *            the new page
	 */
	public void setPage(float page) {
		this.page = page;
	}

	/**
	 * Sets the total.
	 *
	 * @param total
	 *            the new total
	 */
	public void setTotal(float total) {
		this.total = total;
	}
}