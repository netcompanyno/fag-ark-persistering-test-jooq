/**
 * This class is generated by jOOQ
 */
package no.mesan.ark.persistering.generated.routines;


import javax.annotation.Generated;

import no.mesan.ark.persistering.generated.Public;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PagilaPaymentInsertTrigger extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -557636602;

	/**
	 * The parameter <code>public.pagila_payment_insert_trigger.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"), false);

	/**
	 * Create a new routine call instance
	 */
	public PagilaPaymentInsertTrigger() {
		super("pagila_payment_insert_trigger", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}
