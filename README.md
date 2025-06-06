# xnews Application

## 📖 Overview

**xnews** is a Java-based console application that fetches and displays personalized news articles using the [NewsAPI](https://newsapi.org/). It reads user preferences from a JSON file and presents news articles based on preferred topics, languages, and sorting criteria.

## 🧩 Features

- Reads user preferences from a JSON file (`users.json`)
- Fetches live news articles using the NewsAPI
- Filters articles by query, language, and sorting options
- Parses and displays news articles in the console

---

## 🔑 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/Phonix10/Xnews.git
cd xnews
```

### 2. Generate NewsAPI Key
- Go to https://newsapi.org/
- Sign up and obtain a free API key
- Add your API key in NewsApiClient.java

### 3. Update users.json
Define user preferences in app/src/main/resources/users.json.
Example:

```json
[
  {
    "image": "John",
    "language": "en",
    "sortBy": "publishedAt"
  }
]
```

## ⚙️ Build and Run

- Compile and Run the Application
```bash
bash run.sh
```

- Expected Output:

```makefile
Hello John!
Fetching news articles...
Title: Global Tech Innovation Rising
Description: A surge in global tech innovation...
URL: https://news.example.com/article123
```

## 🧪 Run Unit Tests

# Unit tests included for:
- App
- NewsApiClient
- NewsParser

# To run tests:

```bash
bash run.sh
```

## 📄 Key Files

Here's a description of the key files in this project:

* **`App.java`**: The main entry point of the application. It reads user preferences, coordinates with the `NewsApiClient` to fetch news, and potentially handles the display of articles (though the current description doesn't detail output).
* **`UserPreferences.java`**: A data class that encapsulates the user's settings for fetching news, such as keywords, categories, etc.
* **`NewsApiClient.java`**: Responsible for constructing the API URL for NewsAPI and making HTTP requests to fetch news articles.
* **`NewsApiResponse.java`**: A data class that maps the JSON response received from the NewsAPI into a Java object structure.
* **`NewsArticle.java`**: Represents a single news article, holding attributes like title, description, URL, etc.
* **`NewsParser.java`**: Handles the parsing of the raw JSON string response from NewsAPI into a list of `NewsArticle` objects.

✅ Completion Checklist

- Complete UserPreferences.java
- Implement readUserPreferences() in App.java
- Create NewsArticle and NewsApiResponse models
- Implement parse() in NewsParser.java
- Implement fetchNewsArticles() and buildUrl() in NewsApiClient.java
- Pass all unit tests
- Run app and verify output


## 📬 Contact
For questions or support, reach out at uditranjan11@gmail.com 
