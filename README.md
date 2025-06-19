# 🎵 Music Playlist Manager App

### 👤 Author: Asimit Shrivastava ST10471627

---

## 📱 Overview of the App
The **Music Playlist Manager App** is a simple and intuitive Android application designed to help users log, manage, and view their favorite music playlists. It includes three main screens—Welcome, Input, and Display—which provide a smooth user experience for entering and organizing musical data.

---

## 🎯 Purpose of the App
This app allows users to:
- Log music playlist entries with title, genre, duration, and description.
- Navigate between different screens to input and view data.
- Filter music based on specific criteria such as duration.
- Build a personalized music archive over time.

---

## 🌟 Features of the App

### 🖼️ Welcome Screen
- **UI Elements:**
  - **TextView** with a friendly welcome message.
  - **“Get Started” Button**: Navigates to the Input screen.
  - **“Exit” Button**: Closes the app using `finishAffinity()`.
- **Screenshot:**
  ![Welcome Screen](https://github.com/user-attachments/assets/23d57d47-6fe1-45a4-8426-de1873a35693)

---

### 📝 Input Screen
- **UI Elements:**
  - **Four EditTexts** for:
    - Playlist Title
    - Genre
    - Duration (minutes – numeric only)
    - Description or Notes
  - **Buttons**:
    - `Add to List`: Saves the playlist item after validating inputs.
    - `Go to Display Screen`: Navigates to the Display screen.
    - `Clear Contents`: Clears all text fields.
    - `Exit App`: Exits the application.
- **Screenshot:**
  ![Input Screen](https://github.com/user-attachments/assets/e9ccd221-522c-4687-98e7-afcc19be4fec)

---

### 📊 Display Screen
- **UI Elements:**
  - **TextView header**: "Playlist Display"
  - **Buttons**:
    - `Show All Playlists`: Displays all saved items.
    - `Filter by Duration > 5 min`: Filters and displays playlists longer than 5 minutes.
  - **Two TextViews** to show results.
  - **Back Button**: Returns to the Input screen.
- **Screenshot:**
  ![Display Screen](https://github.com/user-attachments/assets/ac035efb-f692-4b1c-b620-7e2480de056e)

---

## 🎨 Design Considerations

### 🔘 Buttons
- **Color themes**:
  - Green: Save actions (e.g., Add to List)
  - Blue: Navigation (e.g., Go to Display)
  - Red: Exit or Clear
- Button Actions:
  - From Welcome → Input: “Get Started”
  - From Input → Display: “Go to Display Screen”
  - All screens: “Exit” calls `finishAffinity()` to safely close app.

### ✍️ EditTexts
- On the Input screen:
  - Hints provided for clarity.
  - Backgrounds and paddings added for comfort.
  - `Duration` input is restricted to numeric format.

### 📝 TextViews
- Used for:
  - App headers
  - Field labels
  - Output display areas
- Styled with readable fonts and appropriate colors.

---

## 🛠️ Usability and Error Handling
- Input validation ensures:
  - No fields are left empty.
  - Duration field accepts only numeric input.
- **Toast messages** inform the user:
  - When inputs are incorrect.
  - When data is successfully saved.

---

## 🎨 Personal Design Inspiration and Touches
- Each screen uses a **custom background image** relevant to music.
- **Color scheme**:
  - Calming blues, music-themed purples, and action-driven reds.
- Attention to visual balance:
  - Consistent layout spacing
  - Matching button shapes and rounded corners
- Screenshots reflect a consistent and polished look across the app.

---

## 🔁 Development Workflow

### 🧠 Version Control
- Used **Git** for local tracking of all code changes.

### 🌐 GitHub
- Hosted the code on **GitHub** for cloud backup and collaboration.

### 🤖 GitHub Actions
- Automated build and test checks (if extended in future).
- Ready for integration of CI/CD deployment pipelines.

### ✅ Key Benefits
- Transparent code history and easy collaboration
- Ability to revert to previous versions
- Automation of workflows for quality assurance

---

## ✅ Conclusion
The **Music Playlist Manager App** is a sleek and functional Android application that merges user experience with musical personalization. It was designed with attention to both visual aesthetics and robust functionality, ensuring users can enjoy building and managing their playlists seamlessly.

---
