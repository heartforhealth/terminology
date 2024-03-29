package io.h4h.terminology


import io.h4h.fhir.r4.base.CodeableEnumeration
import io.h4h.fhir.r4.base.Quantity



enum class Units : CodeableEnumeration {

    Months,
    mmHg,
    mmolPerL,
    mgPerDl,
    Bpm,
    Kg,
    Second,
    Minutes,
    Hours,
    Cm;

    /**
     * UCUM Code
     * */
    override val code: String
        get() = when (this) {
            Months -> "mo"
            mmHg -> "mm[Hg]"
            mmolPerL -> "mmol/L"
            Bpm -> "/min"
            Kg -> "kg"
            Second -> "s"
            mgPerDl -> "mg/dL"
            Minutes -> "m"
            Hours -> "h"
            Cm -> "cm"
        }

    /**
     * UCUM System
     * */
    override val system = Systems.UCUM.url


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            Months -> "mo"
            mmHg -> "mmHg"
            mmolPerL -> "mmol/L"
            Bpm -> "beats/minute"
            Kg -> "kg"
            Second -> "Sec"
            mgPerDl -> "mg/dL"
            Minutes -> "m"
            Hours -> "h"
            Cm -> "cm"
        }

    /// no definition
    override val definition: String? = null

    /// Quantity
    fun quantity(value: Double) = Quantity(
        code = code,
        unit = display,
        value = value,
        system = system
    )

}