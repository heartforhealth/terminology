package io.h4h.terminology


enum class Systems {

    /**
     * World's most widely used terminology standard for health measurements, observations, and documents
     * */
    Loinc,

    /**
     * Most comprehensive, multilingual clinical healthcare terminology in the world
     * */
    SNOMED,

    /**
     * Unified Code for Units of Measure (UCUM) is a code system intended to include all units of measures
     * */
    UCUM;

    /**
     * Formal URL
     * */
    val url: String
        get() = when (this) {
            Loinc -> "http://loinc.org"
            SNOMED -> "http://snomed.info/sct"
            UCUM -> "http://unitsofmeasure.org"
        }
}