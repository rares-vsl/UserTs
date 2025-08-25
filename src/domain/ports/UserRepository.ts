import {type User} from '../User';
import {type UserID} from '../UserID';

export type UserRepository = {
    findByUsername(username: string): Promise<User | null>;
	getAllUsers(): Promise<User[]>;
	findUserById(id: UserID): Promise<User | null>;
	updateUser(user: User): Promise<User>;
	addNewUser(user: User): Promise<User>;
	removeUser(user: User): Promise<void>;
};
