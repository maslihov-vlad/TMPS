# Lab 3: Behavioral Design Patterns

>The main goal of this lab work is to get common with Behavioral Design Patterns and code some addons to our first lab work. I chosed State as pattern to implement.

>Author: Maslihov Vlad Faf-193 

### Used Technologies:

- Windows 10 
- Kotlin
- Intelij Idea

### Implementation:
> Pattern: State
> Changes: now the seller has a set of phrases (phrasesset.kt), which has several states (Morning, Afternoon, Evening). Depending on the time, different states are used from time to time

----------------------------------------------------------------
>PhrasesSet interface
![изображение](https://user-images.githubusercontent.com/71000648/144848647-b27e1239-872f-43b8-be95-58d76eb100c0.png)
----------------------------------------------------------------
The Morning, Afternoon and Evening classes implement the PhrasesSet interface and are specific states. They can also change the state themselves (the line seller.setphrasesset(Afternoon()))
>Example:
![изображение](https://user-images.githubusercontent.com/71000648/144848867-f0d4231d-0d3a-4ebb-ab93-24ed5cd2b335.png)
----------------------------------------------------------------
>Using PhrasesSet in the BookSeller class
![изображение](https://user-images.githubusercontent.com/71000648/144849047-12bb280b-035a-45e6-b3ec-6310832355c2.png)
![изображение](https://user-images.githubusercontent.com/71000648/144849104-135d15fa-c461-46fb-81da-d7ad5b1899ee.png)
----------------------------------------------------------------
>To run the kotlin code use Intelij Idea IDE 


> Link to my Git: https://github.com/maslihov-vlad
