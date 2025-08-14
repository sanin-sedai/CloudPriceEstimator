# ☁️ Cloud Price Estimator

A full-stack web application that helps users **estimate cloud service costs** by selecting resources like compute, storage, and databases, choosing regions, and specifying usage units.  
Built with **React** (frontend) and **Spring Boot** (backend).

---

## 📌 Features
- Select cloud resources (compute, storage, database) and regions  
- Enter usage units to get real-time cost estimation  
- Backend API for cost calculation and persistence  
- Simple, responsive UI for smooth user experience  

---

## 🛠 Tech Stack

### **Frontend**
- npm 10.5.0
- node v18.20.2
- React 19.1.1 (Create React App)

### **Backend**
- Spring Boot 3.5.4
- JDK 17
- Maven 3.8.7 (build tool)
- PostgreSQL 14

---

## 🚀 Setup Instructions

### **1. Clone the repository**
```bash
git clone https://github.com/sanin-sedai/CloudPriceEstimator.git
cd CloudPriceEstimator
```
### **2. Backend Setup (Spring Boot)**

Navigate to backend folder:
```bash
cd backend
 ```
Configure application.properties
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

```
Build and run:
mvn clean install
```bash
./mvnw spring-boot:run
```
Backend will be available at http://localhost:8080
### 3. Frontend Setup (React)

Navigate to frontend folder(Go to CloudPriceEstimator):
```bash
cd frontend
 ```

Install dependencies:
```bash
npm install
```

Start development server:
```bash
npm start
```

Frontend will be available at http://localhost:3000


### 💡 How It Works ###
- User selects resource type and region
- Inputs usage units
- Backend calculates per-unit and total costs
- UI displays results instantly

## 🎥 Demo Video

[![Watch the demo]](https://drive.google.com/file/d/1l5QCzuhQ7y9EGKa9T2zxEcGNK9Ir2DwX/view?usp=sharing)






