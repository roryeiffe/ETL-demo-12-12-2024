# ETL-demo-12-12-2024
Quick demo to go over design patterns, commit messages, best practices using ETL

## 12/12 Requirements
- Have a csv file (can use existing one or create your own)
- Need some way to represent the data
- Need a way to read data from an external file
- Need code to convert the raw data to a Map/dictionary

## 12/13 Requirements
- Utilize the Singleton Design Pattern for both of your "util" classes/modules (CustomDataParser and CustomFileReader)
  - In other words, instead of creating a new CustomFileReader every time we want to read from a file, re-use the same instance.
- References:
  - https://csharpindepth.com/articles/singleton

## 12/14 Requirements
- Create a custom logger that takes in a class/module name and a file output destination
- Next, create a factory that handles the creation logic of loggers (only one logger per class)
- Bonus: Re-Factor Logger Factory to also take into account the file name

## Best Practices to look out for:
- Committing often and including descriptive messages
- Commenting code with enough detail but not too much
  - At least have documentation for each method
- Employing the Single Responsibility Principal, making sure that a given class/module is only responsible for one thing

## Optional
- Logging
- Look into how this existing code can be improved (hint: thinking about design patterns)