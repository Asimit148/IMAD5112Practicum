# 😊 Daily Mood and Journal Tracker App

### 👤 Author: Asimit Shrivastava ST10471627

---

## 📱 Overview of the App
The **Daily Mood and Journal Tracker App** is a simple and elegant Android application designed to help users record, monitor, and reflect on their emotional wellbeing. It offers an intuitive user interface with three streamlined screens—Welcome, Input, and Display—allowing users to input moods, sleep data, and journal notes, and later view or filter that information.

---

## 🎯 Purpose of the App
The app was built to assist users in:
- Monitoring their daily emotional states.
- Tracking sleep duration.
- Writing short journal reflections.
- Identifying trends and emotions that may be linked to lack of sleep or specific mood types.

---

## 🌟 Features of the App

### 🖼️ Welcome Screen
- **UI Elements:**
  - A large **TextView** with a welcoming message.
  - A **“Get Started” Button** to navigate to the Input screen.
  - A **“Exit” Button** to close the app.
- **Screenshot:**
 ![image](https://github.com/user-attachments/assets/23d57d47-6fe1-45a4-8426-de1873a35693)



---

### 📝 Input Screen
- **UI Elements:**
  - **Four EditTexts** for:
    - Mood
    - Mood Type
    - Sleep Hours (with numeric validation)
    - Journal Entry
  - **Four Buttons**:
    - `Add to List`: Validates and stores entry data.
    - `Go to Display Screen`: Navigates to Mood Display screen.
    - `Clear Contents`: Clears input fields.
    - `Exit App`: Exits the app.
- **Screenshot:**
 

---

### 📊 Display Screen
- **UI Elements:**
  - A **header TextView** ("Display List")
  - **Two Buttons**:
    - `Show All Emotions`: Displays all entries.
    - `Show entries with sleep < 6 hours`: Filters entries based on sleep hours.
  - **Two TextViews** to display output.
  - A **Back Button** to return to the Input screen.
- **Screenshot:**
  ![image](https://github.com/user-attachments/assets/ac035efb-f692-4b1c-b620-7e2480de056e)

  



---

## 🎨 Design Considerations

### 🔘 Buttons
- Consistent and purposeful color themes:
  - Green for **Add**
  - Blue for **Navigation**
  - Red for **Exit/Clear**
- Each button has a clearly defined role and action:
  - Welcome screen → Input screen (via “Get Started”)
  - Input screen → Display screen (via “Go to Display Screen”)
  - Exit buttons use `finishAffinity()` to close the app properly.

### ✍️ EditTexts
- Found on the Input screen:
  - Designed with hints to guide user input.
  - Padded and background-tinted for visibility.
  - `inputSleepHours` is numeric to restrict to numbers only.
  
### 📝 TextViews
- Welcome message
- Form title
- Display headers
- Outputs for emotion and sleep logs


---

## 🛠️ Usability and Error Handling
- Robust **input validation**:
  - Ensures fields are not empty.
  - Prevents invalid or non-numeric entries for sleep hours.
- Clear **Toast messages** guide the user through errors or success.
- Prevents app crashes from malformed inputs.

---

## 🎨 Personal Design Inspiration and Touches
- **Custom background images** were created for each screen, matching the theme of emotional tracking and reflection.
- **Color palette**:
  - Calming blues and greens.
  - Contrasting reds for alerts/actions.
- All UI components were styled for accessibility and comfort.
- Every layout was crafted with a consistent design language.


---

## 🔁 Development Workflow

### 🧠 Version Control
- The app's source code was tracked using **Git**.
- Each stage of development was committed with meaningful messages.

### 🌐 GitHub
- Hosted in a remote GitHub repository.
- Allows easy collaboration, backup, and sharing.

### 🤖 GitHub Actions
- Integrated **CI/CD workflows** for potential builds and checks.
- Future deployment steps can be automated with Actions.

### ✅ Benefits:
- Easy rollback and versioning
- Visibility into project history
- Reliable collaboration and error tracking

---

## ✅ Conclusion
The **Daily Mood and Journal Tracker App** is a well-rounded tool that blends intuitive UI design with meaningful functionality. With simple navigation, visual appeal, and robust data handling, it encourages users to build healthy habits through consistent emotional tracking.

---

