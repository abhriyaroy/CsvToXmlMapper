# CsvToXmlMapper
While translating your app, your translator provides you with a `.csv` file containing the translated strings and you 
wonder how boring and tedious it will be to copy those strings one by one? Look no more! CsvToXmlMapper is here to your rescue!

## Sample input

Sample `strings.xml` input file:

<p align="center">
  <img src="resources/Original_strings.png" alt="strings.xml" hspace="2">
</p> 

Sample `csv_file_from_translator.csv` input file:

<p align="center">
  <img src="resources/File_from_translator.png" alt="csv_file_from_translator.csv" hspace="2">
</p> 

## Sample output

Sample `strings.xml` output file:

<p align="center">
  <img src="resources/Modified_strings.png" alt="strings.xml" hspace="2">
</p> 


## How to use
- Clone the repository
- Paste your original `strings.xml` file at the root level inside the project  to overwrite the existing file.
- Paste your original csv file which contains the translated strings at the root level inside the project
- Open the `main.kt` file in the project
- Change the file name we are passing to the `FileReader` to match your file name as👇
  ```
   val csvReaderBuilder = CSVReaderBuilder(
        FileReader("<your file name here>.csv")
    )
  ```
- Run the project!

You should now have an output file which would be named `strings_translated.xml` containing your formatted translatted string! 🚀


## About the Author

### Abhriya Roy

 Android Developer with 3 years of experience in building apps that look and feel great. 
 Enthusiastic towards writing clean and maintainable code.
 Open source contributor.

 <a href="https://www.linkedin.com/in/abhriya-roy/"><img src="https://i.imgur.com/toWXOAd.png" alt="LinkedIn" width=40 height=40></a>     &nbsp;
 <a href="https://twitter.com/AbhriyaR"><img src="https://i.imgur.com/ymEo5Iy.png" alt="Twitter" width=42 height=40></a> 
 &nbsp;
 <a href="https://stackoverflow.com/users/6197251/abhriya-roy"><img src="https://i.imgur.com/JakJaHP.png" alt="Stack Overflow" width=40  height=40></a> 
 &nbsp;
 <a href="https://angel.co/abhriya-roy?public_profile=1"><img src="https://i.imgur.com/TiwMDMK.png" alt="Angel List" width=40  height=40></a>
 &nbsp;
 <a href="https://play.google.com/store/apps/developer?id=Zebro+Studio"><img src="https://i.imgur.com/Rj1IsYI.png" alt="Angel List" width=40  height=40></a>

 <br>
  
