"use strict";
var User = (function () {
    function User() {
    }
    User.prototype.setId = function (id) {
        this._id = id;
    };
    User.prototype.getId = function () {
        return this._id;
    };
    User.prototype.setUsername = function (username) {
        this._username = username;
    };
    User.prototype.getUsername = function () {
        return this._username;
    };
    User.prototype.setEmail = function (email) {
        this._email = email;
    };
    User.prototype.getEmail = function () {
        return this._email;
    };
    return User;
}());
exports.User = User;
//# sourceMappingURL=user.model.js.map