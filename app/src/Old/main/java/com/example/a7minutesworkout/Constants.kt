package com.example.a7minutesworkout

object Constants {

    fun defaultExerciselist(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumping_jacks,
            false,
            false
        )

        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "Push Ups",
            R.drawable.pushups,
            false,
            false
        )
        exerciseList.add(pushUp)

        val abCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.ab_crunch,
            false,
            false
        )
        exerciseList.add(abCrunch)

        val stepUp = ExerciseModel(
            5,
            "Step-Up Onto Chair",
            R.drawable.stepup,
            false,
            false
        )
        exerciseList.add(stepUp)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.squat,
            false,
            false
        )
        exerciseList.add(squat)

        val tricepsDip = ExerciseModel(
            7,
            "Triceps Dip On Chair",
            R.drawable.triceps_dip,
            false,
            false
        )
        exerciseList.add(tricepsDip)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.plank,
            false,
            false
        )
        exerciseList.add(plank)

        val highKnees = ExerciseModel(
            9,
            "High Knees Running In Place",
            R.drawable.high_knees,
            false,
            false
        )
        exerciseList.add(highKnees)

        val lunge = ExerciseModel(
            10,
            "Lunges",
            R.drawable.lunge,
            false,
            false
        )
        exerciseList.add(lunge)

        val pushUpAndRotation = ExerciseModel(
            11,
            "Push ups And Rotation",
            R.drawable.pushup_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(
            12,
            "Side Plank",
            R.drawable.side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }

}