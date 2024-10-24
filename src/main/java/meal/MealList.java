package meal;
import java.util.ArrayList;

public class MealList {
    private ArrayList<Meal> meals;

    public MealList() {
        meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public Meal deleteMeal(int index) {
        Meal mealToBeDeleted = meals.get(index);
        meals.remove(index);
        return mealToBeDeleted;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

}

