package io.h4h.terminology.codesets

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * The internal EKG algorithm already generates an interpretation according to this enum.
 * */
enum class KardiaEKGClassification : CodeableEnumeration {

    normal,
    sinus_rhythm,
    afib,
    bradycardia,
    no_analysis,
    sinus_rhythm_multiple_pacs,
    sinus_rhythm_multiple_pvcs,
    sinus_rhythm_wide_qrs,
    tachycardia,
    too_long,
    too_short,
    unclassified,
    unreadable;


    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            normal -> "normal"
            sinus_rhythm -> "sinus_rhythm"
            afib -> "afib"
            bradycardia -> "bradycardia"
            no_analysis -> "no_analysis"
            sinus_rhythm_multiple_pacs -> "sinus_rhythm,multiple_pacs"
            sinus_rhythm_multiple_pvcs -> "sinus_rhythm,multiple_pvcs"
            sinus_rhythm_wide_qrs -> "sinus_rhythm,wide_qrs"
            tachycardia -> "tachycardia"
            too_long -> "too_long"
            too_short -> "too_short"
            unclassified -> "unclassified"
            unreadable -> "unreadable"
        }


    /**
     * Loinc System
     * */
    override val system = "com.kardia.conclusion"


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            normal -> "Normal"
            sinus_rhythm -> "Sinusrhythm"
            afib -> "Atrial fibrillation"
            bradycardia -> "Bradycardia"
            no_analysis -> "No analysis possible"
            sinus_rhythm_multiple_pacs -> "Sinusrhythm, PACs"
            sinus_rhythm_multiple_pvcs -> "Sinusrhythm, PVCs"
            sinus_rhythm_wide_qrs -> "Sinusrhythm, wide QRS"
            tachycardia -> "Tachycardia"
            too_long -> "Too long"
            too_short -> "Too short"
            unclassified -> "Unclassified"
            unreadable -> "Noise"
        }


    /**
     * Definition
     * */
    override val definition: String?
        get() = display

}
