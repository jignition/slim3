/*
 * Copyright 2004-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.slim3.gen.message;

/**
 * Represents the message code.
 * 
 * @author taedium
 * @since 3.0
 */
public enum MessageCode {

    /** */
    SILM3GEN0001("Failed to create a Meta class. Check a detail message displayed in the Error Log view(for Eclipse) or the console(for javac)."),
    /** */
    SILM3GEN0002("Element[{0}] is handling."),
    /** */
    SILM3GEN0003("Element[{0}] is handled."),
    /** */
    SILM3GEN0004("Already exists. Generation Skipped. ({0}.java:0)"),
    /** */
    SILM3GEN0005("Generated. ({0}.java:0)"),
    /** */
    SILM3GEN0006("Already exists. Generation Skipped. ({0})"),
    /** */
    SILM3GEN0007("Generated. ({0})");

    /** the message */
    public final String message;

    private MessageCode(String message) {
        this.message = message;
    }
}