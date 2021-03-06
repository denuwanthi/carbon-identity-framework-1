/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.user.store.count.jdbc.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.user.store.count.AbstractCountRetrieverFactory;
import org.wso2.carbon.identity.user.store.count.exception.UserStoreCounterException;
import org.wso2.carbon.user.api.RealmConfiguration;

/**
 *
 */
public class InternalCountRetrieverFactory extends AbstractCountRetrieverFactory {

    public static final String INTERNAL = InternalCountRetriever.class.getName();
    private static final Log log = LogFactory.getLog(InternalCountRetrieverFactory.class);

    public InternalCountRetriever buildCountRetriever(RealmConfiguration realmConfiguration)
            throws UserStoreCounterException {
        InternalCountRetriever internalCountRetriever = new InternalCountRetriever();
        internalCountRetriever.init(realmConfiguration);

        if (log.isDebugEnabled()) {
            log.debug("Created new count retriever of type : " + INTERNAL);
        }
        return internalCountRetriever;
    }

    @Override public String getCounterType () {
        return INTERNAL;
    }
}

