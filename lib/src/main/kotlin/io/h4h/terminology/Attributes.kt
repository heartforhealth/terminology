package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * Set of terminology concepts
 * */
enum class Attributes : CodeableEnumeration {


    /**
     * Other things used mainly for inputs
     * */
    PhysicalActivity,
    Smoking,
    Gender,
    Ethnicity;



    /**
     * SNOMED CT Code
     * */
    override val code: String
        get() = when (this) {
            /// other things
            PhysicalActivity -> "68130003"
            Smoking -> "365981007"
            Gender -> "263495000"
            Ethnicity -> "397731000"
        }


    override val system = "http://snomed.info/sct"


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            /// other things
            PhysicalActivity -> "Physical activity"
            Smoking -> "Smoking"
            Gender -> "Gender"
            Ethnicity -> "Ethnicity"
        }


    /// no definition
    override val definition: String? = null

}

