/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.web;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * A simple {@link Authenticator} which replies with a fixed username and password.
 * 
 * @author Sean Owen (srowen@google.com)
 */
final class EmailAuthenticator extends Authenticator {

  private final String emailUsername;
  private final String emailPassword;

  EmailAuthenticator(String emailUsername, String emailPassword) {
    this.emailUsername = emailUsername;
    this.emailPassword = emailPassword;
  }

  @Override
  protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(emailUsername, emailPassword);
  }

}