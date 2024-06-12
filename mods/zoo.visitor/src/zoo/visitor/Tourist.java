package zoo.visitor;

import zoo.tours.api.Tour;
import zoo.tours.reservations.TourFinder;

import java.util.List;

public class Tourist {

    public static void main(String[] args) {
        Tour singleTour = TourFinder.findSingleTour();
        System.out.println("Single tour: " +singleTour);

        List<Tour> allTours = TourFinder.findAllTours();
        System.out.println("# tours: " +allTours.size());
    }
}
