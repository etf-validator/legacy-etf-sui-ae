/*
 * Copyright ${year} interactive instruments GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.interactive_instruments.etf.suim;

import de.interactive_instruments.etf.LocalizableError;

import java.util.Map;

/**
 * @author J. Herrmann ( herrmann <aT) interactive-instruments (doT> de )
 */
public class TranslatableAssertionError extends LocalizableError {

	public TranslatableAssertionError(final String translationTemplate, final String... translations) {
		super(translationTemplate, translations);
	}

	@Override public String getMessage() {
		if(this.arguments!=null && !arguments.isEmpty()) {
			final StringBuilder builder = new StringBuilder("<etfTranslate what='"+this.id+"'>");
			for (final Map.Entry<String, Object> stringObjectEntry : this.arguments.entrySet()) {
				builder.append("<").append(stringObjectEntry.getKey()).append(">");
				builder.append(stringObjectEntry.getValue());
				builder.append("</").append(stringObjectEntry.getKey()).append(">");
			}
			builder.append("</etfTranslate>");
			return builder.toString();
		}
		return "<etfTranslate what='"+this.id+"'/>";
	}
}
