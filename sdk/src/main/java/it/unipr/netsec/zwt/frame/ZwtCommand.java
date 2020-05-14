/*
 * Copyright (c) 2018 NetSec Lab - University of Parma (Italy)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND. IN NO EVENT
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package it.unipr.netsec.zwt.frame;


import it.unipr.netsec.zwt.ZwtButton;
import it.unipr.netsec.zwt.frame.ZwtCommandListener;


/** Command.
  */
public class ZwtCommand extends ZwtButton {
	
	/** CommandListener */
	ZwtCommandListener listener;


	/** Creates a new command. */
	protected ZwtCommand(String label, ZwtCommandListener listener) {
		super(label,null,null);
		this.listener=listener;
	}

	/** Creates a new command. */
	protected ZwtCommand(String label, int commandType, ZwtCommandListener listener) {
		super(label,null,null);
		this.listener=listener;
	}

	/** Gets the command listener. */
	public ZwtCommandListener getListener() {
		return listener;
	}

}
