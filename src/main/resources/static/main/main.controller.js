(function () {
    'strict mode';

    angular
        .module('myApp.main', ['ui.router'])
        .controller('MainController', MainController);

    function MainController($http) {
        var vm = this;
        vm.addNewUser = addNewUser;

        //Constructor
        vm.newUser = {};
        _refreshListOfUsers();

        //public methods
        function addNewUser() {

            $http
                .post("/api/users", vm.newUser)
                .then(_refreshListOfUsers);
            vm.newUser = {};
        }

        //private methods
        function _refreshListOfUsers() {
            $http
                .get("/api/users")
                .then(function (users) {
                    vm.users = users.data;
                });
        }

    }

})();