/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.security.KeyStore;
import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * The crypto cms component is used for encrypting data in CMS Enveloped Data
 * format, decrypting CMS Enveloped Data, signing data in CMS Signed Data
 * format, and verifying CMS Signed Data.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class CryptoCmsEndpoint {


    public static class CryptoCmsCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        CryptoCmsCommon(String path) {
            super("crypto-cms", path);
        }
        /**
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto-cms:sign sets sign as the operation.
         * Possible values: sign, verify, encrypt, or decrypt. The option is a
         * org.apache.camel.component.crypto.cms.CryptoOperation type.
         */
        public T cryptoOperation(CryptoOperation cryptoOperation) {
            this.properties.put("cryptoOperation", cryptoOperation);
            return (T) this;
        }
        /**
         * The name part in the URI can be chosen by the user to distinguish
         * between different signer/verifier/encryptor/decryptor endpoints
         * within the camel context. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Keystore which contains signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter
         * 'keyStoreParameters'. The option is a java.security.KeyStore type.
         */
        public T keyStore(KeyStore keyStore) {
            this.properties.put("keyStore", keyStore);
            return (T) this;
        }
        /**
         * Keystore containing signer private keys, verifier public keys,
         * encryptor public keys, decryptor private keys depending on the
         * operation. Use either this parameter or the parameter 'keystore'. The
         * option is a org.apache.camel.support.jsse.KeyStoreParameters type.
         */
        public T keyStoreParameters(Object keyStoreParameters) {
            this.properties.put("keyStoreParameters", keyStoreParameters);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets the password of the private keys. It is assumed that all private
         * keys in the keystore have the same password. If not set then it is
         * assumed that the password of the private keys is given by the
         * keystore password given in the KeyStoreParameters. The option is a
         * char[] type.
         */
        public T password(Character[] password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * If true then the CMS message is base 64 encoded and must be decoded
         * during the processing. Default value is false. The option is a
         * java.lang.Boolean type.
         */
        public T fromBase64(Boolean fromBase64) {
            this.properties.put("fromBase64", fromBase64);
            return (T) this;
        }
        /**
         * Encryption algorithm, for example DESede/CBC/PKCS5Padding. Further
         * possible values: DESede/CBC/PKCS5Padding, AES/CBC/PKCS5Padding,
         * Camellia/CBC/PKCS5Padding, CAST5/CBC/PKCS5Padding. The option is a
         * java.lang.String type.
         */
        public T contentEncryptionAlgorithm(String contentEncryptionAlgorithm) {
            this.properties.put("contentEncryptionAlgorithm", contentEncryptionAlgorithm);
            return (T) this;
        }
        /**
         * Provider for the originator info. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The default value is
         * null. The option is a
         * org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider type.
         */
        public T originatorInformationProvider(
                Object originatorInformationProvider) {
            this.properties.put("originatorInformationProvider", originatorInformationProvider);
            return (T) this;
        }
        /**
         * Recipient Info: reference to a bean which implements the interface
         * org.apache.camel.component.crypto.cms.api.TransRecipientInfo. The
         * option is a
         * java.util.List<org.apache.camel.component.crypto.cms.crypt.RecipientInfo> type.
         */
        public T recipient(List<Object> recipient) {
            this.properties.put("recipient", recipient);
            return (T) this;
        }
        /**
         * Key length for the secret symmetric key used for the content
         * encryption. Only used if the specified content-encryption algorithm
         * allows keys of different sizes. If
         * contentEncryptionAlgorithm=AES/CBC/PKCS5Padding or
         * Camellia/CBC/PKCS5Padding then 128; if
         * contentEncryptionAlgorithm=DESede/CBC/PKCS5Padding then 192, 128; if
         * strong encryption is enabled then for AES/CBC/PKCS5Padding and
         * Camellia/CBC/PKCS5Padding also the key lengths 192 and 256 are
         * possible. The option is a int type.
         */
        public T secretKeyLength(int secretKeyLength) {
            this.properties.put("secretKeyLength", secretKeyLength);
            return (T) this;
        }
        /**
         * Provider of the generator for the unprotected attributes. The default
         * value is null which means no unprotected attribute is added to the
         * Enveloped Data object. See
         * https://tools.ietf.org/html/rfc5652#section-6.1. The option is a
         * org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider type.
         */
        public T unprotectedAttributesGeneratorProvider(
                Object unprotectedAttributesGeneratorProvider) {
            this.properties.put("unprotectedAttributesGeneratorProvider", unprotectedAttributesGeneratorProvider);
            return (T) this;
        }
        /**
         * Indicates whether the Signed Data or Enveloped Data instance shall be
         * base 64 encoded. Default value is false. The option is a
         * java.lang.Boolean type.
         */
        public T toBase64(Boolean toBase64) {
            this.properties.put("toBase64", toBase64);
            return (T) this;
        }
        /**
         * Indicates whether the signed content should be included into the
         * Signed Data instance. If false then a detached Signed Data instance
         * is created in the header CamelCryptoCmsSignedData. The option is a
         * java.lang.Boolean type.
         */
        public T includeContent(Boolean includeContent) {
            this.properties.put("includeContent", includeContent);
            return (T) this;
        }
        /**
         * Signer information: reference to bean(s) which implements
         * org.apache.camel.component.crypto.cms.api.SignerInfo. Multiple values
         * can be separated by comma. The option is a java.lang.String type.
         */
        public T signer(List<Object> signer) {
            this.properties.put("signer", signer);
            return (T) this;
        }
        /**
         * Indicates whether the value in the header CamelCryptoCmsSignedData is
         * base64 encoded. Default value is false. Only relevant for detached
         * signatures. In the detached signature case, the header contains the
         * Signed Data object. The option is a java.lang.Boolean type.
         */
        public T signedDataHeaderBase64(Boolean signedDataHeaderBase64) {
            this.properties.put("signedDataHeaderBase64", signedDataHeaderBase64);
            return (T) this;
        }
        /**
         * If true then the signatures of all signers contained in the Signed
         * Data object are verified. If false then only one signature whose
         * signer info matches with one of the specified certificates is
         * verified. Default value is true. The option is a java.lang.Boolean
         * type.
         */
        public T verifySignaturesOfAllSigners(
                Boolean verifySignaturesOfAllSigners) {
            this.properties.put("verifySignaturesOfAllSigners", verifySignaturesOfAllSigners);
            return (T) this;
        }
    }

    public static class CryptoCmsProducer
            extends
                CryptoCmsCommon<CryptoCmsProducer>
            implements
                EndpointDefinition.Producer {
        public CryptoCmsProducer(String path) {
            super(path);
        }
    }

    public static enum CryptoOperation {
        sign, verify, encrypt, decrypt;
    }
}