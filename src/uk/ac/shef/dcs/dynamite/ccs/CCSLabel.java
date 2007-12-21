/* CCSLabel.java - A label on a CCS transition.
   Copyright (C) 2007 The University of Sheffield

This file is part of DynamiTE.

DynamiTE is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3, or (at your option)
any later version.

DynamiTE is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with DynamiTE; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.
*/

package uk.ac.shef.dcs.dynamite.ccs;

import uk.ac.shef.dcs.dynamite.lts.Label;

/**
 * Represents a CCS transition label.
 *
 * @author Andrew John Hughes (gnu_andrew@member.fsf.org)
 */
public class CCSLabel
    extends Label
{
 
    /**
     * Constructs a CCS new label using the given string.
     *
     * @param label the label to use.
     * @throws IllegalArgumentException if the label is invalid.
     */
    public CCSLabel(String label)
    {
	super(label);
    }

    /**
     * CCS allows any label, so this method always returns true.
     *
     * @param label the label to check.
     * @return true.
     */   
    public boolean isValid(String label)
    {
	return true;
    }
}