# Credit Flux: Credit Card Reward Optimization App

## App Description
**Credit Flux** is a sophisticated yet user-friendly application designed to help users maximize their credit card rewards and optimize spending. By analyzing spending patterns and leveraging a comprehensive database of credit cards, Credit Flux provides personalized recommendations to ensure users earn the maximum rewards possible while minimizing fees and optimizing benefits. This application empowers users to make informed financial decisions with ease and confidence.

Key features include expense tracking, card management, reward optimization, and detailed analytics. With secure user management and intuitive reporting tools, Credit Flux is the ultimate tool for savvy credit card users looking to unlock the full potential of their spending.

---

## Features

### User Management & Authentication
- **User registration and login**
- **Profile management**
- **Secure authentication**
  - JWT/OAuth2
- **Password reset functionality**
- **Email verification**

---

### Expense Tracking
- **Manual expense input**
- **CSV file import functionality**
- **Expense categorization**
  - Dining
  - Travel
  - Groceries
  - Gas
  - Entertainment
  - Online Shopping
  - Others
- **Monthly expense summaries**
- **Custom category creation**

---

### Credit Card Management
- **Database of popular credit cards**
  - Card details including:
    - Reward rates by category
    - Annual fees
    - Sign-up bonuses
    - Foreign transaction fees
    - Additional benefits
- **Ability to add custom cards**
- **Card comparison tools**

---

### Reward Optimization Engine
- **Optimal card recommendations based on spending**
- **Reward calculations by category**
- **Annual fee consideration**
- **Net reward analysis**
- **"What-if" scenario planning**
- **Multi-card strategy recommendations**

---

### Analytics Dashboard
- **Spending patterns visualization**
- **Monthly/yearly reward summaries**
- **Category breakdown charts**
- **Potential savings calculations**
- **Historical spending trends**
- **Reward earning forecasts**

---

### Recommendations
- **Personalized card recommendations**
- **Optimization suggestions**
- **Spending category insights**
- **Alternative card combinations**
- **Upgrade/downgrade suggestions**

---

### Export & Reports
- **PDF report generation**
- **CSV data export**
- **Monthly summaries**
- **Year-end tax reports**
- **Reward tracking statements**

---

### Additional Features
- **Email notifications for:**
  - Reward milestones
  - Category spending alerts
  - New card recommendations
- **Mobile responsiveness**
- **Dark/light mode**
- **Data backup/restore**
- **Help/tutorial system**

---

## Tech Stack

### Backend
- **Spring Boot**: For robust backend API development and business logic.
- **Spring Security**: For secure user authentication and authorization.
- **Spring Data JPA**: For seamless database interactions.
- **Database**: MySQL is used to store user data, expenses, and card information.
- **Plaid API**: For integrating real-time financial data and connecting user accounts.

### Frontend
- **React**: For a modern, and interactive user interface.

### Data Analysis & Visualization
- **D3.js**: For analytics and visualizing spending patterns and trends.

### Tools
- **JUnit**: For unit testing backend functionality.

### Deployment
- **Docker**: For containerized application deployment.
- **AWS**: For hosting the backend services.

