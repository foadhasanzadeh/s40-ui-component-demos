/*
 * Copyright © 2012 Nokia Corporation. All rights reserved.
 * Nokia and Nokia Connecting People are registered trademarks of Nokia Corporation. 
 * Oracle and Java are trademarks or registered trademarks of Oracle and/or its
 * affiliates. Other product and company names mentioned herein may be trademarks
 * or trade names of their respective owners. 
 * See LICENSE.TXT for license information.
 */ 

package com.nokia.uihelpers.gesture;

import com.nokia.uihelpers.gesture.SafeGestureEvent;


public interface SafeGestureListener {
    public void gestureAction(Object container,
        SafeGestureInteractiveZone gestureInteractiveZone,
        SafeGestureEvent gestureEvent);
}
