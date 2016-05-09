package zeno.util.tools.counter;

import java.util.Iterator;

/**
 * The {@code IntegerCounter} class creates a counter for integer values.
 *
 * @author Zeno
 * @since May 5, 2016
 * @see Iterator
 * @see Integer
 */
public class IntegerCounter implements Iterator<Integer>
{
	private int next;
	
	/**
	 * Creates a new {@code IntegerCounter}.
	 */
	public IntegerCounter()
	{
		next = 0;
	}
	
	@Override
	public boolean hasNext()
	{
		return next != Integer.MAX_VALUE;
	}

	@Override
	public Integer next()
	{
		return ++next;
	}
}