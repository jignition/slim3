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
package org.slim3.datastore;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slim3.tester.AppEngineTestCase;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Entity;

/**
 * @author higa
 * 
 */
public class SpikeTest extends AppEngineTestCase {

    /**
     * @throws Exception
     */
    @Test
    public void spike() throws Exception {
        List<Blob> blobList = new ArrayList<Blob>();
        blobList.add(new Blob(new byte[] { 1 }));
        blobList.add(new Blob(new byte[] { 1 }));
        Entity entity = new Entity("Hoge");
        entity.setProperty("blobList", blobList);
        Datastore.put(entity);
    }
}