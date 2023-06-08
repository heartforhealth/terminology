package io.h4h.terminology.codesets

import io.h4h.fhir.r4.base.CodeableEnumeration
import io.h4h.terminology.Systems


/**
 * ValueSet for the ISO/IEEE 11073-10101 Nomenclature filtered by Object partition
 *
 * Nomenclature for communication of information from point-of-care medical devices. Primary emphasis is placed on acute care medical devices and patient vital signs information.
 *
 * https://terminology.hl7.org/3.0.0/CodeSystem-v3-mdc.html
 * https://build.fhir.org/ig/HL7/uv-pocd/ValueSet-11073MDC-object.html
 * */
enum class MDC : CodeableEnumeration {

    MDC_ECG_ELEC_POTL_I,
    MDC_ECG_ELEC_POTL_II,
    MDC_ECG_ELEC_POTL_III;


    /**
     * ISO Code
     * */
    override val code: String
        get() = when (this) {
            MDC_ECG_ELEC_POTL_I -> "131329"
            MDC_ECG_ELEC_POTL_II -> "131330"
            MDC_ECG_ELEC_POTL_III -> "131389"
        }

    /**
     * MDC System
     * */
    override val system = Systems.MDC.url


    /**
     * Human readable text
     * */
    override val display: String
        get() = name

    /// no definition
    override val definition: String? = null
}