/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.mina.transport.serial;

import org.apache.mina.common.IoSessionConfig;

/**
 * An {@link IoSessionConfig} for serial transport type.
 * All those parameters are extracted from rxtx.org API for more details :
 * http://www.rxtx.org
 * @author The Apache MINA Project (dev@mina.apache.org)
 * @version $Rev: 529576 $, $Date: 2007-04-17 14:25:07 +0200 (mar., 17 avr. 2007) $
 */
public interface SerialSessionConfig extends IoSessionConfig {

    /**
     * Gets the input buffer size. Note that this method is advisory and the underlying OS 
     * may choose not to report correct values for the buffer size.
     * @return input buffer size in bytes
     */
    int getInputBufferSize();

    /**
     * Sets the input buffer size. Note that this is advisory and memory availability may 
     * determine the ultimate buffer size used by the driver.
     * @param bufferSize the buffer size in bytes
     */
    void setInputBufferSize(int bufferSize);

    /**
     * Is the low latency mode is enabled.
     * @return low latency on
     */
    boolean isLowLantecy();

    /**
     * Set the low latency mode, be carefull it's not supported by all the OS/hardware. 
     * @param lowLatency
     */
    void setLowLatency(boolean lowLatency);

    /**
     * TODO : to test if it's usefull for MINA
     * @return
     */
    int getReceiveThreshold();

    /**
     * TODO : to test if it's usefull for MINA
     * @param bytes
     */
    void setReceiveThreshold(int bytes);

    /**
     * TODO : to test if it's usefull for MINA
     * @param bytes
     */
    int getReceiveTimeout();

    /**
     * TODO : to test if it's usefull for MINA
     * @param bytes
     */
    void setReceiveTimeout(int milliseconds);
}
