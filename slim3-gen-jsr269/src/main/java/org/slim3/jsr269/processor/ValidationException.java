/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
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
package org.slim3.jsr269.processor;

import javax.lang.model.element.Element;

import org.slim3.gen.message.MessageCode;

/**
 * Thrown when validation in annotation processing is failed.
 * 
 * @author taedium
 * @since 1.0.0
 * 
 */
public class ValidationException extends AptException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new {@link ValidationException}.
     * 
     * @param messageCode
     *            the message code
     * @param element
     *            the element
     * @param args
     *            arguments
     */
    public ValidationException(MessageCode messageCode, Element element,
            Object... args) {
        this(messageCode, element, null, args);
    }

    /**
     * Creates a new {@link ValidationException}.
     * 
     * @param messageCode
     *            the message code
     * @param element
     *            the element
     * @param cause
     *            the cause
     * @param args
     *            arguments
     */
    public ValidationException(MessageCode messageCode, Element element,
            Throwable cause, Object... args) {
        super(messageCode, element, cause, args);
    }
}
