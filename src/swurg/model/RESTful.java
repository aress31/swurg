/*
#    Copyright (C) 2016 Alexandre Teyar

# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at

# http://www.apache.org/licenses/LICENSE-2.0

# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
#    limitations under the License. 
*/

package swurg.model;

import java.util.List;
import java.util.Map;

public class RESTful {
	private String swagger;
	private Info info;
    private String host;
    private String basePath;
    private List<String> schemes;
    private Map<String, Path> paths;
    private Map<String, Definition> definitions;

	public RESTful(String swagger, Info info, String host, String basePath, List<String> schemes, 
			Map<String, Path> paths, Map<String, Definition> definitions) {
		this.swagger = swagger;
		this.info = info;
		this.host = host;
		this.basePath = basePath;
		this.schemes = schemes;
		this.paths = paths;
		this.definitions = definitions;
    }

    public String getSwaggerVersion() {
    	return this.swagger;
    }

    public Info getInfo() {
    	return this.info;
    }

    public String getHost() {
    	return this.host;
    }

    public String getBasePath() {
    	return this.basePath;
    }

    public List<String> getSchemes() {
    	return this.schemes;
    }

    public Map<String, Path> getPaths() {
    	return this.paths;
    }

    public Map<String, Definition> getDefinitions() {
    	return this.definitions;
    }

    public void setHost(String host) {
        this.host = host;
    }
}

