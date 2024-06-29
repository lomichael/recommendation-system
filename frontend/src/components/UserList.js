import React, { useState, useEffect } from 'react';
import { getUsers } from '../services/api';

const UserList = ({ selectUser }) => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        getUsers().then(response => {
            setUsers(response.data);
        }).catch(error => {
            console.error('Error fetching users:', error);
        });
    }, []);

    return (
        <div>
            <h2>Users</h2>
            <ul>
                {users.map(user => (
                    <li key={user.id} onClick={() => selectUser(user)} style={{ cursor: 'pointer' }}>
                        {user.name}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default UserList;

