package io.h4h.terminology


import io.h4h.fhir.r4.base.CodeableEnumeration
import io.h4h.fhir.r4.base.Quantity



enum class Units : CodeableEnumeration {

    Months,
    mmHg,
    Bpm,
    Kg;

    /**
     * UCUM Code
     * */
    override val code: String
        get() = when (this) {
            Months -> "mo"
            mmHg -> "mm[Hg]"
            Bpm -> "/min"
            Kg -> "kg"
        }

    /**
     * UCUM System
     * */
    override val system = "http://unitsofmeasure.org"


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            Months -> "mo"
            mmHg -> "mmHg"
            Bpm -> "beats/minute"
            Kg -> "kg"
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