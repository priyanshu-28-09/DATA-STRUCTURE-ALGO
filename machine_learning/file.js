import numpy as np 
from sklearn.datasets import load_iris  
from sklearn.model_selection import train_test_split  
from sklearn.preprocessing import StandardScaler
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.utils import to_categorical

print("----loading and preparing dat---")

iris = load_iris()
x,y = iris.data, iris.target

y = to_categorical(y)

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)
scaler = StandardScaler()
x_train = scaler.fit_transform(x_train)
x_test = scaler.transform(x_test)

print("data prepared and spilt")
print(f"x_train shape: {x_train.shape}")
print(f"y_train shape: {y_train.shape}")

print("\n----Building the Model ---")
model = Sequential([
    Dense(10, activation='relu', input_shape=(x_train.shape[1],)),
    Dense(10, activation='relu'),
    Dense(3, activation='softmax')
])
print("\n----Compiling the Model ---")
model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
model.summary()

print("\n--Tranining the model---")
history = model.fit(x_train,y_train, epochs=50, batch_size=5, validation_data=(x_test, y_test),verbose=1)
print("\---evaluating the model on the data----")
loss, accuracy = model.evaluate(x_test, y_test, verbose = 0)
print(f"Test Accuray: {accuracy*100:.2f}%")
print(f"Test Loss: {loss:.4f}")

printf("\n--- making a prediction ---")
sample_prediction = model.predict(X_test[:1])
predicted_class = np.argmax(sample_prediction)
true_class = np.argmax(Y_test[:1])

print(f"Prediction Probabilities: {sample_prediction}")
print(f"Predicted Class:  {iris.target_name[predicted_class]}")
print(f"True Class: {iris.target_name[true_class]}")