/*
<<<<<<< HEAD
<<<<<<< HEAD
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
=======
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
>>>>>>> b8255cb... Added license headers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

<<<<<<< HEAD
package org.wso2.is.portal.user.client.api.bean;

import org.wso2.carbon.uuf.spi.auth.User;

=======
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
=======
>>>>>>> b8255cb... Added license headers
package org.wso2.is.portal.user.client.api.bean;

<<<<<<< HEAD
>>>>>>> ea073eb... Adding UUF based user to work with User Portal login
=======
import org.wso2.carbon.uuf.spi.auth.User;

>>>>>>> 0dfb5d6... Integrating pax exam test framework to product-is
/**
 * Temporary UUFUser to login to user portal.
 *
 * //todo enable cs
 */
<<<<<<< HEAD
<<<<<<< HEAD
public class UUFUser implements User {
=======
public class UUFUser implements org.wso2.carbon.uuf.spi.auth.User {
>>>>>>> ea073eb... Adding UUF based user to work with User Portal login
=======
public class UUFUser implements User {
>>>>>>> 0dfb5d6... Integrating pax exam test framework to product-is

    private static final long serialVersionUID = 34114512424L;

    private String username;

    private String userId;

    private String domainName;

    public UUFUser(String username, String userId, String domainName) {
        this.username = username;
        this.userId = userId;
        this.domainName = domainName;
    }

    @Override
    public boolean hasPermission(String s, String s1) {
        return false; //todo
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

}
