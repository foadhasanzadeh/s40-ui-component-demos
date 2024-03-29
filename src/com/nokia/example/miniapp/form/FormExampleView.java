/*
 * Copyright © 2012 Nokia Corporation. All rights reserved.
 * Nokia and Nokia Connecting People are registered trademarks of Nokia Corporation. 
 * Oracle and Java are trademarks or registered trademarks of Oracle and/or its
 * affiliates. Other product and company names mentioned herein may be trademarks
 * or trade names of their respective owners. 
 * See LICENSE.TXT for license information.
 */
package com.nokia.example.miniapp.form;

import com.nokia.example.miniapp.utils.Commands;
import com.nokia.uihelpers.Compatibility;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Form;

/**
 * Base class for Form examples
 */
public abstract class FormExampleView
    extends Form {
    
    protected static final boolean IS_FT = Compatibility.isFullTouch();

    public FormExampleView(String title, CommandListener commandListener) {
        super(title);
        this.addCommand(Commands.OK);
        this.addCommand(Commands.INFORMATION);
        this.addCommand(Commands.BACK);
        this.setCommandListener(commandListener);
    }

    /**
     * Called to tell the view to store the current values, in order for
     * the view to be able to revert the values back to the original ones
     * in case the user decides to press the back button
     */
    protected abstract void storeCurrentValues();

    /**
     * Called by the parent when the user has pressed back. Reverts the 
     * values of the components back to where they were when the user 
     * entered the view.
     */
    protected abstract void cancelChanges();

    /**
     * Called by the parent when the user has pressed back.
     * @return true if confirm dialog needs to be shown to the user.
     */
    protected boolean confirmChanges() {
        return true;
    }
}
