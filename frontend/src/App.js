import React, { useState } from 'react';
import UserList from './components/UserList';
import ContentList from './components/ContentList';

const App = () => {
    const [selectedUser, setSelectedUser] = useState(null);

    return (
        <div className="App">
            <UserList selectUser={setSelectedUser} />
            <ContentList selectedUser={selectedUser} />
        </div>
    );
};

export default App;

