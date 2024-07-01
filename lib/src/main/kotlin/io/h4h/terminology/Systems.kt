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
    UCUM,

    /**
     * MDC Object infrastructure and Device nomenclature
     * */
    MDC,

    /**
     * Burgerservicenummer
     * */
    BSN,

    /**
     * Ontario, Canada Personal Health Number
     * */
    CanadaOntarioPersonalHealthNumber,

    /**
     * Heart for Health custom codes
     * */
    H4H;

    /**
     * Formal URL
     * */
    val url: String
        get() = when (this) {
            Loinc -> "http://loinc.org"
            SNOMED -> "http://snomed.info/sct"
            UCUM -> "http://unitsofmeasure.org"
            MDC -> "urn:oid:2.16.840.1.113883.6.24"
            BSN -> "http://fhir.nl/fhir/NamingSystem/bsn"
            CanadaOntarioPersonalHealthNumber -> "https://fhir.infoway-inforoute.ca/NamingSystem/ca-on-patient-hcn"
            H4H -> "com.h4h.conclusion"
        }
}