/*
 * ACS AEM Commons
 *
 * Copyright (C) 2013 - 2023 Adobe
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
package com.adobe.acs.commons.models.injectors.impl.model;


import com.day.cq.i18n.I18n;

public interface TestModelI18nValue {
    String getValidI18nField();

    String getInvalidI18nField();

    String getAnotherValidI18nField();

    String getInjectField();

    I18n getI18n();

    String getValidI18nFieldResource();

    String getAnotherValidI18nFieldResource();

    I18n getAlternateI18n();
}
