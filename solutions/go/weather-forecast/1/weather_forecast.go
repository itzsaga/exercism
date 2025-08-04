// Package weather tells you the weather forecast.
package weather

// CurrentCondition represents the current condition of the weather.
var CurrentCondition string
// CurrentLocation represents the current location being forecast.
var CurrentLocation string

// Forecast takes in the city and condition as strings and returns a string of the forecast.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
