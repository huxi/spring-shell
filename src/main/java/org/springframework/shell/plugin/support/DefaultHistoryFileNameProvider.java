/*
 * Copyright 2011-2012 the original author or authors.
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
package org.springframework.shell.plugin.support;

import org.springframework.shell.Constant;
import org.springframework.shell.plugin.HistoryFileNameProvider;
import org.springframework.stereotype.Component;

/**
 * Default history file provider. Default file is {@link org.springframework.shell.Constant.HISTORY_FILE_NAME}
 * 
 * @author Jarred Li
 *
 */
@Component
public class DefaultHistoryFileNameProvider implements HistoryFileNameProvider{

	/* (non-Javadoc)
	 * @see org.springframework.core.Ordered#getOrder()
	 */
	public int getOrder() {
		return Integer.MAX_VALUE;
	}

	/* (non-Javadoc)
	 * @see org.springframework.shell.plugin.HistoryFileProvider#getHistoryFileName()
	 */
	public String getHistoryFileName() {
		return Constant.HISTORY_FILE_NAME;
	}

}