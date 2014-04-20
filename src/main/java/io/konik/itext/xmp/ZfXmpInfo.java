/* Copyright (C) 2014 konik.io
 *
 * This file is part of the Konik library.
 *
 * The Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * The Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with the Konik library. If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.itext.xmp;

import static io.konik.util.Strings.isNullOrEmpty;

import java.util.Arrays;

import io.konik.invoice.profiles.InvoiceProfile;
import io.konik.util.Strings;

/**
 * This entity represents ZUGFeRD meta data that a part of the PDF/A XMP extension. <br/>
 * Example:
 * 
 * <pre>
 *  <zf:ConformanceLevel>BASIC</zf:ConformanceLevel>
 *  <zf:DocumentFileName>ZUGFeRD-invoice.xml</zf:DocumentFileName>
 *  <zf:DocumentType>INVOICE</zf:DocumentType>
 *  <zf:Version>RC</zf:Version>
 * </pre>
 */
public class ZfXmpInfo {

   /** The conformance level. */
   private String conformanceLevel;

   /** The document file value. */
   private String documentFileName;

   /** The document type. */
   private String documentType;

   /** The version. */
   private String version;

   /**
    * Instantiates a empty ZUGFeRD XMP Info Entity
    */
   public ZfXmpInfo() {
   }

   /**
    * Instantiates a new zf xmp info.
    *
    * @param profile the profile
    * @param documentFileName the document file name
    * @param documentType the document type
    */
   public ZfXmpInfo(InvoiceProfile profile, String documentFileName, String documentType) {
      this.conformanceLevel = profile.conformanceLevel;
      this.documentFileName = documentFileName;
      this.documentType = documentType;
      this.version = InvoiceProfile.VERSION;
   }

   /**
    * Instantiates a new zf xmp meta data.
    *
    * @param conformanceLevel the conformance level
    * @param documentFileName the document file value
    * @param documentType the document type
    * @param version the version
    */
   public ZfXmpInfo(String conformanceLevel, String documentFileName, String documentType, String version) {
      super();
      this.conformanceLevel = conformanceLevel;
      this.documentFileName = documentFileName;
      this.documentType = documentType;
      this.version = version;
   }

   /**
    * Gets the conformance level.
    *
    * @return the conformance level
    */
   public String getConformanceLevel() {
      return conformanceLevel;
   }

   /**
    * Sets the conformance level.
    *
    * @param conformanceLevel the new conformance level
    */
   public void setConformanceLevel(String conformanceLevel) {
      this.conformanceLevel = conformanceLevel;
   }

   /**
    * Gets the document file value.
    *
    * @return the document file value
    */
   public String getDocumentFileName() {
      return documentFileName;
   }

   /**
    * Sets the document file value.
    *
    * @param documentFileName the new document file value
    */
   public void setDocumentFileName(String documentFileName) {
      this.documentFileName = documentFileName;
   }

   /**
    * Gets the document type.
    *
    * @return the document type
    */
   public String getDocumentType() {
      return documentType;
   }

   /**
    * Sets the document type.
    *
    * @param documentType the new document type
    */
   public void setDocumentType(String documentType) {
      this.documentType = documentType;
   }

   /**
    * Gets the version.
    *
    * @return the version
    */
   public String getVersion() {
      return version;
   }

   /**
    * Sets the version.
    *
    * @param version the new version
    */
   public void setVersion(String version) {
      this.version = version;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((conformanceLevel == null) ? 0 : conformanceLevel.hashCode());
      result = prime * result + ((documentFileName == null) ? 0 : documentFileName.hashCode());
      result = prime * result + ((documentType == null) ? 0 : documentType.hashCode());
      result = prime * result + ((version == null) ? 0 : version.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      ZfXmpInfo other = (ZfXmpInfo) obj;
      if (conformanceLevel == null) {
         if (other.conformanceLevel != null) return false;
      } else if (!conformanceLevel.equals(other.conformanceLevel)) return false;
      if (documentFileName == null) {
         if (other.documentFileName != null) return false;
      } else if (!documentFileName.equals(other.documentFileName)) return false;
      if (documentType == null) {
         if (other.documentType != null) return false;
      } else if (!documentType.equals(other.documentType)) return false;
      if (version == null) {
         if (other.version != null) return false;
      } else if (!version.equals(other.version)) return false;
      return true;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("ZfXmpInfo [conformanceLevel=").append(conformanceLevel).append(", documentFileName=")
            .append(documentFileName).append(", documentType=").append(documentType).append(", version=")
            .append(version).append("]");
      return builder.toString();
   }

   /**
    * Checks if content of this entity is valid.
    *
    * @return true, if is valid
    */
   public boolean isValid() {
      return !(isNullOrEmpty(conformanceLevel) && isNullOrEmpty(documentFileName) && isNullOrEmpty(documentType) && isNullOrEmpty(version));
   }
}