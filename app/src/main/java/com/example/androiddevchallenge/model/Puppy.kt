/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import android.os.Parcelable
import com.example.androiddevchallenge.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Puppy(val image: Int, val name: String, val description: String) : Parcelable

fun getFakePuppyList(): List<Puppy> {
    return listOf(
        Puppy(
            R.drawable.german_shepherd,
            "German Shepherd",
            "The German Shepherd is a breed of medium to large-sized working dog that originated in Germany. According to the FCI, the breed's English language name is German Shepherd Dog."
        ),
        Puppy(
            R.drawable.bulldog,
            "Bulldog",
            "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records."
        ),
        Puppy(
            R.drawable.poodle,
            "Poodle",
            "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed’s origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet."
        ),
        Puppy(
            R.drawable.labrador_retriever,
            "Labrador Retriever",
            "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world."
        ),
        Puppy(
            R.drawable.golden_retriever,
            "Golden Retriever",
            "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name \"retriever\" refers to the breed's ability to retrieve shot game undamaged due to their soft mouth."
        ),
        Puppy(
            R.drawable.german_shepherd,
            "German Shepherd",
            "The German Shepherd is a breed of medium to large-sized working dog that originated in Germany. According to the FCI, the breed's English language name is German Shepherd Dog."
        ),
        Puppy(
            R.drawable.bulldog,
            "Bulldog",
            "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records."
        ),
        Puppy(
            R.drawable.poodle,
            "Poodle",
            "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed’s origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet."
        ),
        Puppy(
            R.drawable.labrador_retriever,
            "Labrador Retriever",
            "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world."
        ),
        Puppy(
            R.drawable.golden_retriever,
            "Golden Retriever",
            "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name \"retriever\" refers to the breed's ability to retrieve shot game undamaged due to their soft mouth."
        ),
        Puppy(
            R.drawable.german_shepherd,
            "German Shepherd",
            "The German Shepherd is a breed of medium to large-sized working dog that originated in Germany. According to the FCI, the breed's English language name is German Shepherd Dog."
        ),
        Puppy(
            R.drawable.bulldog,
            "Bulldog",
            "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records."
        ),
        Puppy(
            R.drawable.poodle,
            "Poodle",
            "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed’s origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet."
        ),
        Puppy(
            R.drawable.labrador_retriever,
            "Labrador Retriever",
            "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world."
        ),
        Puppy(
            R.drawable.golden_retriever,
            "Golden Retriever",
            "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name \"retriever\" refers to the breed's ability to retrieve shot game undamaged due to their soft mouth."
        ),
        Puppy(
            R.drawable.german_shepherd,
            "German Shepherd",
            "The German Shepherd is a breed of medium to large-sized working dog that originated in Germany. According to the FCI, the breed's English language name is German Shepherd Dog."
        ),
        Puppy(
            R.drawable.bulldog,
            "Bulldog",
            "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records."
        ),
        Puppy(
            R.drawable.poodle,
            "Poodle",
            "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed’s origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet."
        ),
        Puppy(
            R.drawable.labrador_retriever,
            "Labrador Retriever",
            "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world."
        ),
        Puppy(
            R.drawable.golden_retriever,
            "Golden Retriever",
            "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name \"retriever\" refers to the breed's ability to retrieve shot game undamaged due to their soft mouth."
        )
    )
}
