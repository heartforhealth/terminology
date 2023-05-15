package io.h4h.terminology

import io.h4h.fhir.r4.base.CodeableEnumeration


/**
 * Set of terminology concepts
 * */
enum class Conditions : CodeableEnumeration {

    /**
     * Medical conditions
     * */
    CardiovascularDisease,
    Diabetes,
    DiabetesComplication,
    Hypertension,
    RheumatoidArthritis,
    ActivePsoriasis,
    SedentaryLifestyle,
    FamilyCardiovascularDisease1,
    FamilyCardiovascularDisease2,
    PsychosocialProblems,
    PostMenopausal,
    PreEclampsia,
    Pregnancy,
    Microalbuminuria,
    KidneyFailure,
    AtrialFibrillation,
    LeftVentricleHypertrophy,
    MyocardialInfarction,
    HeartFailure,
    Atherosclerosis,
    Dyslipidemia,
    AnginaPectoris,
    PeripheralVascularDisease,
    Arrhythmia,


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
            /// medical conditions
            CardiovascularDisease -> "49601007"
            Diabetes -> "73211009"
            DiabetesComplication -> "74627003"
            Hypertension -> "38341003"
            RheumatoidArthritis -> "69896004"
            ActivePsoriasis -> "402311006"
            SedentaryLifestyle -> "415510005"
            FamilyCardiovascularDisease1 -> "439724007"
            FamilyCardiovascularDisease2 -> "438825005"
            PsychosocialProblems -> "284465006"
            PostMenopausal -> "76498008"
            PreEclampsia -> "398254007"
            Pregnancy -> "77386006"
            Microalbuminuria -> "312975006"
            KidneyFailure -> "42399005"
            AtrialFibrillation -> "49436004"
            LeftVentricleHypertrophy -> "164873001"
            MyocardialInfarction -> "399211009"
            HeartFailure -> "84114007"
            Atherosclerosis -> "441574008"
            Dyslipidemia -> "370992007"
            AnginaPectoris -> "194828000"
            PeripheralVascularDisease -> "400047006"
            Arrhythmia -> "698247007"

            /// other things
            PhysicalActivity -> "68130003"
            Smoking -> "365981007"
            Gender -> "263495000"
            Ethnicity -> "397731000"
        }


    override val system = Systems.SNOMED.url


    /**
     * Human readable text
     * */
    override val display: String
        get() = when (this) {
            /// medical conditions
            CardiovascularDisease -> "Disorder of cardiovascular system"
            Diabetes -> "Diabetes mellitus"
            DiabetesComplication -> "Diabetic complication"
            Hypertension -> "Hypertensive disorder"
            RheumatoidArthritis -> "Active rheumatoid arthritis"
            ActivePsoriasis -> "Active psoriasis"
            SedentaryLifestyle -> "Sedentary lifestyle"
            FamilyCardiovascularDisease1 -> "First degree relatives with premature CardiovascularDisease (1)"
            FamilyCardiovascularDisease2 -> "First degree relatives with premature CardiovascularDisease (2)"
            PsychosocialProblems -> "Psychosocial problems"
            PostMenopausal -> "Postmenopausal state"
            PreEclampsia -> "Pre-eclampsia"
            Pregnancy -> "Pregnancy"
            Microalbuminuria -> "Microalbuminuria"
            KidneyFailure -> "Renal failure syndrome (Kidney Failure)"
            AtrialFibrillation -> "Atrial fibrillation"
            LeftVentricleHypertrophy -> "Left ventricle hypertrophy (electrocardiographic)"
            MyocardialInfarction -> "History of myocardial infarction"
            HeartFailure -> "Heart failure"
            Atherosclerosis -> "Atherosclerosis"
            Dyslipidemia -> "Dyslipidemia"
            AnginaPectoris -> "Angina pectoris"
            PeripheralVascularDisease -> "Peripheral vascular disease"
            Arrhythmia -> "Cardiac arrhythmia"

            /// other things
            PhysicalActivity -> "Physical activity"
            Smoking -> "Smoking"
            Gender -> "Gender"
            Ethnicity -> "Ethnicity"
        }


    /// no definition
    override val definition: String? = null

}

