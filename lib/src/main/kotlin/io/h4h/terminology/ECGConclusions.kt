package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


enum class ECGConclusions : CodeableEnumeration {

    NoAssessmentPossible,
    SinusRhythm,
    AtrialFibrillation,
    Noise,
    SinusBradycardia,
    SinusTachycardia,
    AtrialFlutter,
    PrematureAtrialComplexes,
    PrematureVentricularComplexes,
    SupraventricularTachycardia,
    AVNRT,
    AtrialTachycardia,
    Asystole,
    AtrioventricularBlockI,
    AtrioventricularBlockII,
    AtrioventricularBlockIII,
    SinusArrest,
    NSVT,
    SustainedVentricularTachycardia,
    SinoatrialBlock,
    Bigeminy,
    Trigeminy,
    BundleBranchBlock,
    Break,
    Malfunction,
    Unclassified,
    Other;


    /**
     * Code
     * */
    override val code: String
        get() = when (this) {
            NoAssessmentPossible -> TODO()
            SinusRhythm -> "251150006"
            AtrialFibrillation -> "164889003"
            Noise -> "251142002"
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
            Bigeminy -> TODO()
            Trigeminy -> "29036000"
            BundleBranchBlock -> "164907000"
            Break -> TODO()
            Malfunction -> "164853006"
            Unclassified -> "1491000"
            Other -> "74964007"
        }

    /**
     * System
     * */
    override val system: String = Systems.SNOMED.url


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            NoAssessmentPossible -> ""
            SinusRhythm -> "Sinus rhythm (finding)"
            AtrialFibrillation -> "Electrocardiographic atrial fibrillation (finding)"
            Noise -> "Noisy electrocardiogram recording (finding)"
            SinusBradycardia -> "Electrocardiogram: sinus bradycardia (finding)"
            SinusTachycardia -> "Electrocardiogram: sinus tachycardia (finding)"
            AtrialFlutter -> "Electrocardiographic atrial flutter (finding)"
            PrematureAtrialComplexes -> "Electrocardiographic Atrial premature complexes (finding)"
            PrematureVentricularComplexes -> "Electrocardiographic Ventricular premature complexes (finding)"
            SupraventricularTachycardia -> "Electrocardiographic supraventricular tachycardia (finding)"
            AVNRT -> "Typical atrioventricular nodal re-entry tachycardia (disorder)"
            AtrialTachycardia -> "Electrocardiographic atrial tachycardia (finding)"
            Asystole -> "Electrocardiographic asystole (finding)"
            AtrioventricularBlockI -> "First degree atrioventricular block (disorder)"
            AtrioventricularBlockII -> "Second degree atrioventricular block (disorder)"
            AtrioventricularBlockIII -> "Complete atrioventricular block (disorder)"
            SinusArrest -> "Sinus arrest (disorder)"
            NSVT -> "Monomorphic NSVT (non-sustained ventricular tachycardia)"
            SustainedVentricularTachycardia -> "Sustained ventricular tachycardia (disorder)"
            SinoatrialBlock -> "Sinoatrial block (disorder)"
            Bigeminy -> TODO()
            Trigeminy -> "Pulsus trigeminus (finding)"
            BundleBranchBlock -> "Electrocardiographic right bundle branch block (finding)"
            Break -> TODO()
            Malfunction -> "Electrocardiogram not done (situation)"
            Unclassified -> "Unclassified (qualifier value)"
            Other -> "Other (qualifier value)"
        }


    /// no definition
    override val definition: String? = null

}