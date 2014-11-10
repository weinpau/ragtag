package com.ragtag;

import java.util.Objects;

/**
 *
 * @author weinpau
 */
public final class MediaType {
    
    public final static MediaType WILDCARD = new MediaType("*", "*");
  
    public final static MediaType APPLICATION_ATOM_XML = new MediaType("application", "atom+xml");
    
    public final static MediaType APPLICATION_FORM_URLENCODED = new MediaType("application", "x-www-form-urlencoded");
    
    public final static MediaType APPLICATION_JSON = new MediaType("application", "json");

    public final static MediaType APPLICATION_SVG_XML = new MediaType("application", "svg+xml");

    public final static MediaType APPLICATION_XHTML_XML = new MediaType("application", "xhtml+xml");

    public final static MediaType APPLICATION_XML = new MediaType("application", "xml");
    
    public final static MediaType MULTIPART_FORM_DATA = new MediaType("multipart", "form-data");

    public final static MediaType APPLICATION_OCTET_STREAM = new MediaType("application", "octet-stream");

    public final static MediaType TEXT_PLAIN = new MediaType("text", "plain");

    public final static MediaType TEXT_XML = new MediaType("text", "xml");

    public final static MediaType TEXT_HTML = new MediaType("text", "html");

    private final String type;
    private final String subType;

    public MediaType(String type, String subType) {
        this.type = type;
        this.subType = subType;
    }

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    @Override
    public String toString() {
        return type + "/" + subType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.subType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MediaType other = (MediaType) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return Objects.equals(this.subType, other.subType);
    }

}
