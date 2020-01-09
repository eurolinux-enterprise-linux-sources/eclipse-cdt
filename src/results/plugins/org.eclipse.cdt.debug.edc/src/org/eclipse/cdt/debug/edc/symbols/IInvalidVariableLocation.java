/*******************************************************************************
 * Copyright (c) 2009, 2010 Nokia and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Nokia - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.debug.edc.symbols;


/**
 * Interface representing that a variable location is invalid
 */
public interface IInvalidVariableLocation extends IVariableLocation {

	/**
	 * Set message
	 * 
	 * @param message
	 *            description of why the location is not valid
	 */
	public void setMessage(String message);

	/**
	 * Get message
	 * 
	 * @return description of why the location is not valid
	 */
	public String getMessage();

}
