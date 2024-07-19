package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * Enum with all conclusion that a Practitioner makes after reviewing an ECG
 * */
enum class ECGConclusions : CodeableEnumeration {

    SinusRhythm,
    AtrialFibrillation,
    SinusArrhythmia,
    SinusBradycardia,
    AtrialFlutter,
    PrematureAtrialComplexes,
    PrematureVentricularComplexes,
    AVNRT,
    AtrialTachycardia,
    SinusTachycardia,
    SupraventricularTachycardia,
    SustainedVentricularTachycardia,
    Asystole,
    AtrioventricularBlockI,
    AtrioventricularBlockII,
    AtrioventricularBlockIII,
    SinusArrest,
    NSVT,
    SinoatrialBlock,
    VentricularBigeminy,
    // SupraventricularBigeminy,
    Trigeminy,
    BundleBranchBlock,
    Noise,

    // custom
    NoAssessmentPossible,
    Break,
    Malfunction,
    Unclassified,
    Other,
    TooLong,
    TooShort,
    DoublePrematureAtrialComplexes,
    DoublePrematureVentricularComplexes;


    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            SinusRhythm -> "251150006"
            AtrialFibrillation -> "164889003"
            SinusArrhythmia -> "423175003"
            SinusBradycardia -> "426177001"
            SinusTachycardia -> "427084000"
            AtrialFlutter -> "164890007"
            PrematureAtrialComplexes -> "164885009"
            PrematureVentricularComplexes -> "164884008"
            SupraventricularTachycardia -> "426761007"
            AVNRT -> "1142105006"
            AtrialTachycardia -> "713422000"
            Asystole -> "427485008"
            AtrioventricularBlockI -> "270492004"
            AtrioventricularBlockII -> "195042002"
            AtrioventricularBlockIII -> "27885002"
            SinusArrest -> "5609005"
            NSVT -> "1237128001"
            SustainedVentricularTachycardia -> "426525004"
            SinoatrialBlock -> "65778007"
            Trigeminy -> "29036000"
            VentricularBigeminy -> "11157007"
            // SupraventricularBigeminy -> "251168009"
            BundleBranchBlock -> "164907000"
            Malfunction -> "164853006"
            Unclassified -> "1491000"
            Noise -> "251142002"
            Other -> "74964007"

            // custom codes
            NoAssessmentPossible,
            Break,
            TooLong,
            TooShort,
            DoublePrematureAtrialComplexes,
            DoublePrematureVentricularComplexes -> name
        }


    /**
     * System
     * */
    override val system: String
        get() = when (this) {
            // custom codes
            NoAssessmentPossible, Break,
            TooLong, TooShort,
            DoublePrematureAtrialComplexes,
            DoublePrematureVentricularComplexes -> Systems.H4H.url

            else -> Systems.SNOMED.url
        }


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            SinusRhythm -> "Sinus rhythm"
            AtrialFibrillation -> "Electrocardiographic atrial fibrillation"
            SinusArrhythmia -> "Sinus arrhythmia"
            SinusBradycardia -> "Electrocardiogram: sinus bradycardia"
            SinusTachycardia -> "Electrocardiogram: sinus tachycardia"
            AtrialFlutter -> "Electrocardiographic atrial flutter"
            PrematureAtrialComplexes -> "Electrocardiographic Atrial premature complexes"
            PrematureVentricularComplexes -> "Electrocardiographic Ventricular premature complexes"
            SupraventricularTachycardia -> "Electrocardiographic supraventricular tachycardia"
            AVNRT -> "Typical atrioventricular nodal re-entry tachycardia"
            AtrialTachycardia -> "Electrocardiographic atrial tachycardia"
            Asystole -> "Electrocardiographic asystole"
            AtrioventricularBlockI -> "First degree atrioventricular block"
            AtrioventricularBlockII -> "Second degree atrioventricular block"
            AtrioventricularBlockIII -> "Complete atrioventricular block"
            SinusArrest -> "Sinus arrest"
            NSVT -> "Monomorphic NSVT (non-sustained ventricular tachycardia)"
            SustainedVentricularTachycardia -> "Sustained ventricular tachycardia"
            SinoatrialBlock -> "Sinoatrial block"
            VentricularBigeminy -> "Ventricular bigeminy"
            // SupraventricularBigeminy -> "Supraventricular bigeminy"
            Trigeminy -> "Pulsus trigeminus"
            BundleBranchBlock -> "Electrocardiographic right bundle branch block"
            Malfunction -> "Malfunction / Electrocardiogram not done"
            Unclassified -> "Unclassified"
            Noise -> "Noisy electrocardiogram recording"
            Other -> "Other"

            // custom codes
            NoAssessmentPossible -> "No Assessment possible"
            Break -> "Break"
            TooLong -> "Recording too long"
            TooShort -> "Recording too short"
            DoublePrematureAtrialComplexes -> "Double PACs (Premature Atrial Complexes)"
            DoublePrematureVentricularComplexes -> "Double PVCs (Premature Ventricular Complexes)"
        }


    /// no definition
    override val definition: String? = null

}