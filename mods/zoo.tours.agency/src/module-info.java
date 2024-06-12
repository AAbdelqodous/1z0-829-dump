module zoo.tours.agency {
    requires zoo.tours.api;
    // we use the provides directive. This allows us to specify that we
    // provide an implementation of the interface with a specific implementation class
    provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
}