/*
 * Copyright (C) 2016 Jorge Ruesga
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
package com.ruesga.gerrit.plugins.fcm.messaging;

public class Notification {
    public String token;
    public int event;
    public String change;
    public String revision;
    public String project;
    public String branch;
    public String topic;
    public String author;
    public String subject;
    public String message;

    @Override
    public Object clone() {
        Notification other = new Notification();
        other.token = token;
        other.event = event;
        other.change = change;
        other.revision = revision;
        other.project = project;
        other.branch = branch;
        other.topic = topic;
        other.author = author;
        other.subject = subject;
        other.message = message;
        return other;
    }
}
