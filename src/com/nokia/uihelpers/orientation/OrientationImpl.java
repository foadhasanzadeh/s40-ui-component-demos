/*
 * Copyright © 2012 Nokia Corporation. All rights reserved.
 * Nokia and Nokia Connecting People are registered trademarks of Nokia Corporation.
 * Oracle and Java are trademarks or registered trademarks of Oracle and/or its
 * affiliates. Other product and company names mentioned herein may be trademarks
 * or trade names of their respective owners.
 * See LICENSE.TXT for license information.
 */
package com.nokia.uihelpers.orientation;

class OrientationImpl
    extends Orientation
    implements com.nokia.mid.ui.orientation.OrientationListener {

    OrientationImpl() {
        // Listen for orientation events
        com.nokia.mid.ui.orientation.Orientation.addOrientationListener(this);
    }

    /**
     * Deliver sizeChanged event to listener
     * @param newDisplayOrientation
     */
    public void displayOrientationChanged(int newDisplayOrientation) {
        com.nokia.mid.ui.orientation.Orientation.setAppOrientation(
            newDisplayOrientation);
    }
}
